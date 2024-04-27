package com.example.cloudVendorController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloudVendorModel.CloudVendor;
import com.example.cloudVendorService.CloudVendorService;

// balaji RestController

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	CloudVendor cloudVendor;
	@Autowired
	CloudVendorService cloudVendorService;
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);
		
	}
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendor();
		
	}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVendor(cloudVendor);
		return "CloudVendor Creaed Successfully";
	}
	@PutMapping
	public String upadateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "CloudVendor Updated Successfully";
	}
	@DeleteMapping("{vendorId}")
	public String deleteVendorIdDetails(@PathVariable("vendorId") String vendorId) {
		cloudVendorService.DeleteCloudVendor(vendorId);
		return "CloudVendor Delete Successfully";
	}
	
}
