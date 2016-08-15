import java.util.ArrayList;

public class PathTest
{
	public static void main(String[] args)
	{
		ArrayList<LatLng> points = new ArrayList<LatLng>();
        LatLng point0 = new LatLng(1, 1); //3
        LatLng point1 = new LatLng(0, 1); //2
        LatLng point2 = new LatLng(0, 0); //1
        LatLng point3 = new LatLng(1, 0);
        points.add(point0);
        points.add(point1);
        points.add(point2);
        points.add(point3);

		//Region area = new Region();
		System.out.println("PATH");
		Path area = new Path();
		area.setPoints(points);
		area.outputWaypointsToOctave();
		System.out.println("\n-------------");

		Region region = new Region();
		region.setPoints(points);
		region.setAreaType(AreaType.LAWNMOWER);
		region.setAreaType(AreaType.SPIRAL);
		region.outputRegionToOctave();
	}
}
