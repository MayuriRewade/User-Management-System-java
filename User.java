package in.soft.entity;

public class User {	
		private int uid;
		private String uname;
		private Float usal;
		private String uloc;
		private String udes;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public Float getUsal() {
			return usal;
		}
		public void setUsal(Float usal) {
			this.usal = usal;
		}
		public String getUloc() {
			return uloc;
		}
		public void setUloc(String uloc) {
			this.uloc = uloc;
		}
		public String getUdes() {
			return udes;
		}
		public void setUdes(String udes) {
			this.udes = udes;
		}
		@Override
		public String toString() {
			return "User [uid=" + uid + ", uname=" + uname + ", usal=" + usal + ", uloc=" + uloc + ", udes=" + udes + "]";
		}
		
		


}
