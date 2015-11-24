package io.hexlet.xo.model;

import io.hexlet.xo.model.Point;

public class Field {

	public String f00;

	public String f01;

	public String f02;

	public String f10;

	public String f11;

	public String f12;

	public String f20;

	public String f21;

	public String f22;

	public int getSize() {
		return 3;
    	}

   	public String getFigure(final Point point) {
		// BEGIN (write your solution here)
		public String getPoint(Point p) {
			
			if (p.x == 0 && p.y == 0) return f00;
						
			if (p.x == 1 && p.y == 0) return f10;
						
			if (p.x == 2 && p.y == 0) return f20;
						
			if (p.x == 0 && p.y == 1) return f01;
						 
			if (p.x == 1 && p.y == 1) return f11;
						
			if (p.x == 2 && p.y == 1) return f21;
						
			if (p.x == 0 && p.y == 2) return f02;
						
			if (p.x == 1 && p.y == 2) return f12;
						
			if (p.x == 2 && p.y == 2) return f22;
			
			return " ";
		}	
		// END
	}	

    	public void setFigure(final Point point, final String figure) {
		// BEGIN (write your solution here)
			
			if (p.x == 0 && p.y == 0) return f00 = figure;
						
			if (p.x == 1 && p.y == 0) return f10 = figure;
						
			if (p.x == 2 && p.y == 0) return f20 = figure;
						
			if (p.x == 0 && p.y == 1) return f01 = figure;
						
			if (p.x == 1 && p.y == 1) return f11 = figure;
						
			if (p.x == 2 && p.y == 1) return f21 = figure;
						
			if (p.x == 0 && p.y == 2) return f02 = figure;
						
			if (p.x == 1 && p.y == 2) return f12 = figure;
						
			if (p.x == 2 && p.y == 2) return f22 = figure;
				
			return " ";
			
		// END	

		}
}	
