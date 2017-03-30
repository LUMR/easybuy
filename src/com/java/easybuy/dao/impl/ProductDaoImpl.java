package com.java.easybuy.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.easybuy.dao.BaseDAO;
import com.java.easybuy.dao.ProductDao;
import com.java.easybuy.vo.Category;
import com.java.easybuy.vo.Product;

public class ProductDaoImpl extends BaseDAO implements ProductDao {

	//更新商品信息
	public void add(Product product){
		String sql="insert into easybuy_product values(easybuy_easybuy_product_id.nextval,?,?,?,?,?,?,?,?)";
		try {
			
			this.ps=this.conn.prepareStatement(sql);
			//商品名称
			this.ps.setString(1, product.getName());
			//商品描述
			this.ps.setString(2, product.getDescription());
			//商品价格
			this.ps.setDouble(3, product.getPrice());
			//商品库存
			this.ps.setInt(4, product.getStock());
			//类型类别编号
			this.ps.setInt(5, product.getCategoryLevel1Id());
			//商品二级类别编号
			this.ps.setInt(6, product.getCategoryLevel2Id());
			//商品三级分类编号
			this.ps.setInt(7, product.getCategoryLevel3Id());
			//上传文件名
			this.ps.setString(8, product.getFileName());
			this.ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
	}
	//删除商品
	public void delete(int id){
		String sql = "delete easybuy_product where easybuy_product_id=?";
		try {
			this.ps=this.conn.prepareStatement(sql);
			this.ps.setInt(1, id);
			this.ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
	}
	//获取所有商品
	public List<Product> getAll(){
		List<Product> products = new ArrayList<Product>();
		String sql = "select * from easybuy_product";
		try {
			this.ps=this.conn.prepareStatement(sql);
			this.rs=this.ps.executeQuery();
			while(rs.next()){
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getInt(4));
				product.setStock(rs.getInt(5));
				product.setCategoryLevel1Id(rs.getInt(6));
				product.setCategoryLevel2Id(rs.getInt(7));
				product.setCategoryLevel3Id(rs.getInt(8));
				products.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return products;
	}
	//根据编号获取商品
	public Product getById(int id){
		Product product = null;
		String sql = "select * from easybuy_product where eaysbuy_product_id=?";
		try {
			this.ps=this.conn.prepareStatement(sql);
			this.ps.setInt(1, id);
			this.rs = this.ps.executeQuery();
			while(rs.next()){
				product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getInt(4));
				product.setStock(rs.getInt(5));
				product.setCategoryLevel1Id(rs.getInt(6));
				product.setCategoryLevel2Id(rs.getInt(7));
				product.setCategoryLevel3Id(rs.getInt(8));
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return product;
		
	}
	
	//更新商品
	public void update(Product product){
		String sql="updata easybuy_product set easybuy_product_name=?,easybuy_product_description = ?,easybuy_product_price = ?,easybuy_product_stock = ?,easybuy_product_categoryLevel1_id = ?,easybuy_product_categoryLevel2_id = ?,easybuy_product_file_name = ? easybuy_product_product_id = ?";
		try {
			this.ps=this.conn.prepareStatement(sql);
			this.ps.setString(1, product.getName());
			
			this.ps.setString(2, product.getDescription());
			
			this.ps.setDouble(3, product.getPrice());
			
			this.ps.setInt(4, product.getStock());
			
			this.ps.setInt(5, product.getCategoryLevel1Id());
			
			this.ps.setInt(6, product.getCategoryLevel2Id());
			
			this.ps.setInt(7, product.getCategoryLevel3Id());
			
			this.ps.setString(8, product.getFileName());
			this.ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
	}
	//分页查询商品
	public List<Product> getAllBeginAndEnd(int page,int pagesize){
		List<Product> products = new ArrayList<Product>();
		String sql="select * from easybuy_product limit ?,?";
		Object[] obj = new Object[]{page*pagesize,pagesize};
		try {
			rs = preQuery(sql, obj);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//根据类别查找商品集合
	public List<Product> getAllByCategoryLevel1Id(int cid){
		List<Product> Products = new ArrayList<Product>();
		String sql="select * from easybuy_product where easybuy_product_level1Id=?";
		try {
			this.ps=this.conn.prepareStatement(sql);
			this.ps.setInt(1, cid);
			this.rs=this.ps.executeQuery();
			while(rs.next()){
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getInt(4));
				product.setStock(rs.getInt(5));
				product.setCategoryLevel1Id(rs.getInt(6));
				product.setCategoryLevel2Id(rs.getInt(7));
				product.setCategoryLevel3Id(rs.getInt(8));
				Products.add(product);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return Products;
		
	}
	
	//根据长度查找商品集合
	public List<Product> getAllByLength(int length){
		List<Product> Products = new ArrayList<Product>();
		String sql = "select * from easybuy_product where rownum<?";
		try {
			this.ps=this.conn.prepareStatement(sql);
			this.ps.setInt(1, length);
			this.rs=this.ps.executeQuery();
			while(rs.next()){
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getInt(4));
				product.setStock(rs.getInt(5));
				product.setCategoryLevel1Id(rs.getInt(6));
				product.setCategoryLevel2Id(rs.getInt(7));
				product.setCategoryLevel3Id(rs.getInt(8));
				Products.add(product);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		return Products;
	}
	@Override
	public List<Product> getAllProducts(Category category) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int upDateProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
