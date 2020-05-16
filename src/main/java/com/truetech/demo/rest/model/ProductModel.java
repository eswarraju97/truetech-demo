package com.truetech.demo.rest.model;

public class ProductModel {

    public ProductModel() {

    }

    public ProductModel(Integer id, String prname, String prquintity) {
        super();
        this.id = id;
        this.prname = prname;
        this.prquintity = prquintity;
       
    }
 
    private Integer id;
    private String prname;
    private String prquintity;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrname() {
		return prname;
	}

	public void setPrname(String prname) {
		this.prname = prname;
	}

	public String getPrquintity() {
		return prquintity;
	}

	public void setPrquintity(String prquintity) {
		this.prquintity = prquintity;
	}

	@Override
    public String toString() {
        return "Product Details [id=" + id + ", firstName=" + prname + ", lastName=" + prquintity + "]";
    }
}
