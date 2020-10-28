package com.javaClass;

public class Booking {
	 	private int id;
	 	private String pickupdate;
	    private String returndate;
	    private String vehiclemodel;
	    private String submodel;
	    
	    public Booking() {
	    	
	    }
	    
	    public int getId() {
			return id;
		}
		public String getPickupdate() {
			return pickupdate;
		}
		public String getReturndate() {
			return returndate;
		}
		public String getVehiclemodel() {
			return vehiclemodel;
		}
		public String getSubmodel() {
			return submodel;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setPickupdate(String pickupdate) {
			this.pickupdate = pickupdate;
		}
		public void setReturndate(String returndate) {
			this.returndate = returndate;
		}
		public void setVehiclemodel(String vehiclemodel) {
			this.vehiclemodel = vehiclemodel;
		}
		public void setSubmodel(String submodel) {
			this.submodel = submodel;
		}	    
}

