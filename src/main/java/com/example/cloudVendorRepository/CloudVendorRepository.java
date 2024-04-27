package com.example.cloudVendorRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cloudVendorModel.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{

}
