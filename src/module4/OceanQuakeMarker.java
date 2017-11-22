package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** 地震地图中用于海洋地震的可视化标记类
 * 
 * @author tang
 * @author 你的姓名
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		isOnLand = false;
		SetCheckPoint(new RectShapeCheck(this));
	}

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y)
	{
		pg.rect(x-radius, y-radius, 2*radius, 2*radius);
		CheckPonit.PointList.clear();
		CheckPonit.PointList.add(new Point(x, y));
		CheckPonit.PointList.add(new Point(x+2*radius, y+2*radius));
	}
}
