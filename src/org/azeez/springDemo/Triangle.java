package org.azeez.springDemo;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context=null;
	
	
public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


public void draw() {
		
		//for(Point point: points) {
	
		System.out.println("point = ("+getPointA().getX()+","+pointA.getY()+")");
		System.out.println("point = ("+getPointB().getX()+","+pointB.getY()+")");
		System.out.println("point = ("+getPointC().getX()+","+pointC.getY()+")");
		//}
		
}


@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
	
	
	
}
}
