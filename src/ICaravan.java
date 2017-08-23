
public interface ICaravan {

	Integer getCaravanId();

	void setCaravanId(Integer caravanId);

	String getMake();

	void setMake(String make);

	String getModel();

	void setModel(String model);

	Double getAwnSize();

	void setAwnSize(Double awnSize);

	Double getInternalLength();

	void setInternalLength(Double internalLength);

	Double getShippingLength();

	void setShippingLength(Double shippingLength);

	Double getFixedBed();

	void setFixedBed(Double fixedBed);

	Double getEndBathroom();

	void setEndBathroom(Double endBathroom);

	Double getBerth();

	void setBerth(Double berth);

	Integer getProductionYear();

	void setProductionYear(Integer productionYear);

	Boolean getEnabled();

	void setEnabled(Boolean enabled);

	byte[] getComments();

	void setComments(byte[] comments);

}