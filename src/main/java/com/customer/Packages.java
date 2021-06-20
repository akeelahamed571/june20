package com.customer;

public class Packages {
	private String PackageName;
    public int PackageID;
	private String packageType;
	private String price;
	private String description;
	
	public Packages(int PackageID,String PackageName,String price,String packageType,String description) {
		this.PackageName=PackageName;
		this.PackageID=PackageID;
		this.packageType=packageType;
		this.price=price;
		this.description=description;
	}

	public String getPackageName() {
		return PackageName;
	}

	

	public int getPackageID() {
		return PackageID;
	}

	

	public String getPackageType() {
		return packageType;
	}

	
	public String getPrice() {
		return price;
	}

	

	public String getDescription() {
		return description;
	}

	
	
	
 
}
