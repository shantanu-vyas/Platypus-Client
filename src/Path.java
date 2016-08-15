import java.util.ArrayList;

public class Path
{
	protected ArrayList<LatLng> points = new ArrayList<LatLng>();
	double transectAngle = 0;

	public Path()
	{
	}

	public ArrayList<LatLng> getPoints()
	{
		return points;
	}
	public ArrayList<LatLng> getOriginalPoints()
	{
		return points;
	}
	public void setPoints(ArrayList<LatLng> list)
	{
		points = list;
	}
	public void addPoint(LatLng point)
	{
		points.add(point);
	}
	public void removePoint(int index)
	{
		points.remove(index);
	}
	public void clearPoints()
	{
		points.clear();
	}
	public boolean isEmpty()
	{
		return points.isEmpty();
	}

	public void outputPointsToOctave()
	{
		String output = "";
		System.out.print("x=[");
		for (LatLng a : points)
		{
			System.out.print(a.getLatitude() + ",");
		}
		System.out.print("]");
		System.out.println("\n");
		System.out.print("y=[");
		for (LatLng a : points)
		{
			System.out.print(a.getLongitude() + ",");
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("plot(x,y)");
	}

}
