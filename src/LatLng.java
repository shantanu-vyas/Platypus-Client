public class LatLng
{
	private double latitude;
	private double longitude;

	public LatLng(double lat, double lon)
	{
		latitude = lat;
		longitude = lon;
	}
	public double getLatitude()
	{
		return latitude;
	}
	public void setLatitude(double lat)
	{
		latitude = lat;
	}

	public double getLongitude()
	{
		return longitude;
	}
	public void getLongitude(double lon)
	{
		longitude = lon;
	}
}
