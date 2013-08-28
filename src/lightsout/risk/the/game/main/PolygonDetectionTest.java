package lightsout.risk.the.game.main;

import java.awt.Point;

public class PolygonDetectionTest {

	public boolean isColliding(Point[] polygon, Point colider){
		for(int i=0; i < polygon.length; i++){
			boolean isRightmost = true, isLeftmost = true, isTopmost = true, isBottommost = true;
			for(int c=0; c < polygon.length; c++){
				if(polygon[i].x < polygon[c].x){
					isRightmost = false;
				}
				if(polygon[i].x > polygon[c].x){
					isLeftmost = false;
				}
				if(polygon[i].y > polygon[c].y){
					isTopmost = false;
				}
				if(polygon[i].y < polygon[c].y){
					isBottommost = false;
				}
			}
			if(isRightmost){
				if(colider.x < polygon[i].x){
					return true;
				}
			}

			if(isLeftmost){
				if(colider.x > polygon[i].x){
					return true;
				}
			}
			
			if(isTopmost){
				if(colider.y > polygon[i].y){
					return true;
				}
			}
			
			if(isBottommost){
				if(colider.y < polygon[i].y){
					return true;
				}
			}
		}
		return false;
	}
	
}
