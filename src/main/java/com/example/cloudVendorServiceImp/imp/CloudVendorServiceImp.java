package com.example.cloudVendorServiceImp.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cloudVendorModel.CloudVendor;
import com.example.cloudVendorRepository.CloudVendorRepository;
import com.example.cloudVendorService.CloudVendorService;

@Service
public class CloudVendorServiceImp implements CloudVendorService{
	
	@Autowired
	CloudVendorRepository cloudVendorRepository;

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String DeleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		return cloudVendorRepository.findAll();
	}

}
