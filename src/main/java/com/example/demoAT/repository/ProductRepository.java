package com.example.demoAT.repository;

import com.example.demoAT.entity.Product;
import com.example.demoAT.model.response.ProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = """
               					select p.id as productId
                                       ,p.product_name as productName
                                       ,p.color as color
                                       ,p.quantity as quantity
                                       ,p.sell_price as sellPrice
                                       ,p.origin_price as originPrice
                                       ,p.description as description
                                       ,sbc.id as subCateId
                                       ,sbc.sub_cate_name as subCateName
                                       ,st.id as statusId
                                       ,st.status_name as statusName
                                       ,b.id as brandId
                                       ,b.brand_name as brandName
                                   from 6_10product_xuong.product as p
                                   LEFT JOIN 6_10product_xuong.status st ON p.status_id = st.id
                                   LEFT JOIN 6_10product_xuong.sub_category sbc ON p.subcate_id = sbc.id
                                   LEFT JOIN 6_10product_xuong.product_brand pb ON p.id = pb.product_id
                                   LEFT JOIN 6_10product_xuong.brand b ON b.id = pb.brand_id
                """, nativeQuery = true)
    List<ProductResponse> findAllProduct();



    @Query(value = """
           					select p.id as productId
                                       ,p.product_name as productName
                                       ,p.color as color
                                       ,p.quantity as quantity
                                       ,p.sell_price as sellPrice
                                       ,p.origin_price as originPrice
                                       ,p.description as description
                                       ,sbc.id as subCateId
                                       ,sbc.sub_cate_name as subCateName
                                       ,st.id as statusId
                                       ,st.status_name as statusName
                                       ,b.id as brandId
                                       ,b.brand_name as brandName
                                   from 6_10product_xuong.product as p
                                   LEFT JOIN 6_10product_xuong.status st ON p.status_id = st.id
                                   LEFT JOIN 6_10product_xuong.sub_category sbc ON p.subcate_id = sbc.id
                                   LEFT JOIN 6_10product_xuong.product_brand pb ON p.id = pb.product_id
                                   LEFT JOIN 6_10product_xuong.brand b ON b.id = pb.brand_id
                                   WHERE p.id = :productId
    """, nativeQuery = true)
    ProductResponse findProductById(Long productId);

}
