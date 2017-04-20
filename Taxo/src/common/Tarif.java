/**
 * 
 */
package common;

/**
 * @author aleksei
 *
 */
public class Tarif {

	////////////////////////////////////////////////////////////////
	//Constructors
	////////////////////////////////////////////////////////////////
	Tarif(String tarifName, float percen)
	{
		this.setTarifName(tarifName);
		this.setTopPercent(percen);
		this.setMidPercent(percen);
		this.setLowPercent(percen);
		this.setHiTripBound(1);
		this.setLowTripBound(1);
		this.setHiCostBound(1);
		this.setLowCostBound(1);
	}
	
	
	////////////////////////////////////////////////////////////////
	//Fields
	////////////////////////////////////////////////////////////////
	private float midPercent;
	private float lowPercent;
	private float topPercent;
	private int hiTripBound;
	private int lowTripBound;
	private int lowCostBound;
	private int hiCostBound;
	private String tarifName;
	
	////////////////////////////////////////////////////////////////
	//Geters
	////////////////////////////////////////////////////////////////
	/**
	 * @return the midPercent
	 */
	public float getMidPercent() {
		return midPercent;
	}
	
	/**
	 * @return the lowPercent
	 */
	public float getLowPercent() {
		return lowPercent;
	}
	
	/**
	 * @return the topPercent
	 */
	public float getTopPercent() {
		return topPercent;
	}
	/**
	 * @return the hiTripBound
	 */
	public Object getHiTripBound() {
		return hiTripBound;
	}
	/**
	 * @return the lowTripBound
	 */
	public int getLowTripBound() {
		return lowTripBound;
	}
	/**
	 * @return the lowCostBound
	 */
	public int getLowCostBound() {
		return lowCostBound;
	}
	/**
	 * @return the tarifName
	 */
	public String getTarifName() {
		return tarifName;
	}
	/**
	 * @return the hiCostBound
	 */
	public int getHiCostBound() {
		return hiCostBound;
	}
	////////////////////////////////////////////////////////////////
	//Seters
	////////////////////////////////////////////////////////////////
	/**
	 * @param midPercent the midPercent to set
	 */
	public void setMidPercent(float midPercent) {
		this.midPercent = midPercent;;
	}

	/**
	 * @param lowPercent the lowPercent to set
	 */
	public void setLowPercent(float lowPercent) {
		this.lowPercent = lowPercent;
	}

	/**
	 * @param topPercent the topPercent to set
	 */
	public void setTopPercent(float topPercent) {
		this.topPercent = topPercent;
	}


	/**
	 * @param hiTripBound the hiTripBound to set
	 */
	public void setHiTripBound(int hiTripBound) {
		this.hiTripBound = hiTripBound;
	}

	/**
	 * @param lowTripBound the lowTripBound to set
	 */
	public void setLowTripBound(int lowTripBound) {
		this.lowTripBound = lowTripBound;
	}

	/**
	 * @param lowCostBound the lowCostBound to set
	 */
	public void setLowCostBound(int lowCostBound) {
		this.lowCostBound = lowCostBound;
	}

		/**
	 * @param tarifName the tarifName to set
	 */
	public void setTarifName(String tarifName) {
		this.tarifName = tarifName;
	}

	/**
	 * @param hiCostBound the hiCostBound to set
	 */
	public void setHiCostBound(int hiCostBound) {
		this.hiCostBound = hiCostBound;
	}
	
}
