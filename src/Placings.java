
public class Placings {

	private String PlacingsR128;
	private String PlacingsR64;
	private String PlacingsR32;
	private String PlacingsR16;
	private String PlacingsQF;
	private String PlacingsSF;
	private String PlacingsF;
	private String PlacingsW;

	public Placings(String alg) {
		if (alg.equals("TML")) {
			this.PlacingsR128 = "0.0078";
			this.PlacingsR64 = "0.0156";
			this.PlacingsR32 = "0.0312";
			this.PlacingsR16 = "0.0625";
			this.PlacingsQF = "0.125";
			this.PlacingsSF = "0.25";
			this.PlacingsF = "0.5";
			this.PlacingsW = "1";
		}
		if (alg.equals("ATP")) {
			this.PlacingsR128 = "0.005";
			this.PlacingsR64 = "0.0225";
			this.PlacingsR32 = "0.045";
			this.PlacingsR16 = "0.09";
			this.PlacingsQF = "0.18";
			this.PlacingsSF = "0.36";
			this.PlacingsF = "0.6";
			this.PlacingsW = "1";
		}

	}

	public String getPlacingsR128() {
		return PlacingsR128;
	}

	public void setPlacingsR128(String placingsR128) {
		PlacingsR128 = placingsR128;
	}

	public String getPlacingsR64() {
		return PlacingsR64;
	}

	public void setPlacingsR64(String placingsR64) {
		PlacingsR64 = placingsR64;
	}

	public String getPlacingsR32() {
		return PlacingsR32;
	}

	public void setPlacingsR32(String placingsR32) {
		PlacingsR32 = placingsR32;
	}

	public String getPlacingsR16() {
		return PlacingsR16;
	}

	public void setPlacingsR16(String placingsR16) {
		PlacingsR16 = placingsR16;
	}

	public String getPlacingsQF() {
		return PlacingsQF;
	}

	public void setPlacingsQF(String placingsQF) {
		PlacingsQF = placingsQF;
	}

	public String getPlacingsSF() {
		return PlacingsSF;
	}

	public void setPlacingsSF(String placingsSF) {
		PlacingsSF = placingsSF;
	}

	public String getPlacingsF() {
		return PlacingsF;
	}

	public void setPlacingsF(String placingsF) {
		PlacingsF = placingsF;
	}

	public String getPlacingsW() {
		return PlacingsW;
	}

	public void setPlacingsW(String placingsW) {
		PlacingsW = placingsW;
	}

}
