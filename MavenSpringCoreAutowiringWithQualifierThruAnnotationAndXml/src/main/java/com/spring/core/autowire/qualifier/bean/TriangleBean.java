package com.spring.core.autowire.qualifier.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TriangleBean implements ICoordinates {
	
	private PointsBean points;
	
	public PointsBean getPoints() {
		return points;
	}

	@Autowired
	@Qualifier(value = "makeTriangle")
	public void setPoints(PointsBean points) {
		this.points = points;
	}

	public void drawTriangle() {
		// TODO Auto-generated method stub
		System.out.println("Coordinates Of Triangle Is :: ("+points.getX()+", "+points.getY()+", "+points.getZ()+")");
	}
}
