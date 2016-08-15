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
}
