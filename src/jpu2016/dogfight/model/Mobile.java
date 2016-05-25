package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile 
{
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private String image;
	public Mobile (Direction direction, Position position, Dimension dimension, int speed, String image)
	{
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
		this.image = image;
	}
	public Direction getDirection()
	{
		return direction;
		
	}
	public void setDirection(Direction direction)
	{
		
	}
	public Point getPosition()
	{
		return null;
		
	}
	public Dimension getDimension()
	{
		return dimension;
		
	}
	public int getSpeed()
	{
		return speed;
		
	}
	public int getWidth()
	{
		return speed;
		
	}
	public int getHeight()
	{
		return speed;
		
	}
	public void moove()
	{
		
	}
	public void placeInArea(IArea area)
	{
		
	}
	public boolean isPlayer(int player)
	{
		return false;
		
	}
	public void mooveUp()
	{
		
	}
	public void mooveDown()
	{
		
	}
	public void mooveLeft()
	{
		
	}
	public void mooveRight()
	{
		
	}
	public Color getColor()
	{
		return Color;
		
	}
	public IDogfightModel getDogfightModel()
	{
		return IDogfightModel;
		
	}
	public void setDogfightModel(IDogfightModel dogfightModel)
	{
		
	}
	public boolean isWeapon()
	{
		return false;
		
	}
	public Image getImage()
	{
		return null;
		
	}
}
