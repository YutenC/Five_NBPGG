package com.shopproduct.dao.impl;

import com.shopproduct.core.CoreDaoImpl;
import com.shopproduct.dao.ProductImageDao;
import com.shopproduct.entity.ProductImage;

import java.util.List;

public class ProductImageDaoImpl extends CoreDaoImpl<ProductImage,Integer> implements ProductImageDao {
    @Override
    public int update(ProductImage productImage) {
        return 1;
    }

    @Override
    public List<ProductImage> selectByProductId(Integer id) {
        String hql = "from ProductImage where Product_id = "+ id;
        return (List<ProductImage> )getSession().createQuery(hql,ProductImage.class).getResultList();

    }

    @Override
    public ProductImage getIndexImgByProductId(Integer id) {
        String hql = "from ProductImage where Product_id = "+ id +"and Image like '%index%'";
        return (ProductImage )getSession().createQuery(hql,ProductImage.class).getSingleResult();
    }
}
