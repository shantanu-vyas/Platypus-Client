import java.util.ArrayList;

public class Region extends Path
{
	public enum AreaType
	{
		LAWNMOWER, SPIRAL
	}

	private double transectDistance = .00000898; //10 meters, initial value
	private final double oneMeter = transectDistance/10;
	private AreaType regionType = AreaType.SPIRAL;

	//Points will be the original points
	private ArrayList<LatLng> regionPoints = new ArrayList<LatLng>();
	public Region()
	{
		
	}

	public void setAreaType(AreaType type)
	{
		regionType = type;
	}
	public AreaType getAreaType()
	{
		return regionType;
	}
	public ArrayList<LatLng> getRegionPoints()
	{
		return regionPoints;
	}
	public ArrayList<LatLng> getPoints()
	{
		return points;
	}
	public void setPoints(ArrayList<LatLng> list)
	{
		points = list;
		if (regionType == AreaType.SPIRAL)
		{
			
		}
		if (regionType == AreaType.LAWNMOWER)
		{
			
		}
	}
	public void addPoint(LatLng point)
	{
		if (regionType == AreaType.SPIRAL)
		{
			
		}
		if (regionType == AreaType.LAWNMOWER)
		{
			
		}
	}
	public void removePoint(int index)
	{
		if (regionType == AreaType.SPIRAL)
		{
			
		}
		if (regionType == AreaType.LAWNMOWER)
		{
			
		}
	}
	public void clearPoints()
	{
		points.clear();
		regionPoints.clear();
	}
	public boolean isEmpty()
	{
		return this.points.isEmpty() || regionPoints.isEmpty();
	}

}
