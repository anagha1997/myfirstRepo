/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainfun;

import java.io.File;
import java.io.IOException;
import com.maxmind.geoip2.*;
//import com.maxmind.geoip.LookupService;
import com.maxmind.geoip.regionName;
//import Se;
import com.maxmind.geoip.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
/**
 *
 * @author sonum_000
 */
public class GetLocationExample  {
    
    public  String getLoc(String ur) throws UnknownHostException, IOException{
      InetAddress ipaddress = InetAddress.getByName(ur);
      System.out.println("IP address: " + ipaddress.getHostAddress());
	GetLocationExample obj = new GetLocationExample();
	//ServerLocation location = obj.getLocation("206.190.36.45");
        String ip=ipaddress.toString();
        String location=obj.getLocation(ip);
	return location;
  }

  public String getLocation(String ipAddress) throws IOException {

	File file = new File(
	    "C:\\Users\\Public\\Downloads\\GeoLiteCity.dat");
	return getLocation(ipAddress, file);

  }

  public String getLocation(String ipAddress, File file) throws IOException  {

	ServerLocation serverLocation = null;

       // try{
	serverLocation = new ServerLocation();

	LookupService lookup = new LookupService(file,LookupService.GEOIP_MEMORY_CACHE);
        
	Location locationServices = lookup.getLocation(ipAddress);
        
	serverLocation.setCountryCode(locationServices.countryCode);
        
	serverLocation.setCountryName(locationServices.countryName);
	serverLocation.setRegion(locationServices.region);
	serverLocation.setRegionName(regionName.regionNameByCode(
                locationServices.countryCode, locationServices.region));
	serverLocation.setCity(locationServices.city);
	serverLocation.setPostalCode(locationServices.postalCode);
	serverLocation.setLatitude(String.valueOf(locationServices.latitude));
	serverLocation.setLongitude(String.valueOf(locationServices.longitude));
        
       /* }
         catch (IOException e) {
		System.err.println(e.getMessage());
	*/
        
	return serverLocation.toString();

  }
}
