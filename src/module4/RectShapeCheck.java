package module4;

import java.security.Policy;

/**
 * Created by WangGF on 2017/11/20.
 */
public class RectShapeCheck extends ICheckPoint{
    public RectShapeCheck(){super();}
    public RectShapeCheck(CommonMarker marker)
    {
        super(marker);
    }
    @Override
    public boolean CheckPointIsArea(float point1,float point2)
    {
        return false;
    }

    @Override
    public boolean CheckPointIsArea(Point point) {
        if (PointList.isEmpty())return false;
        if (point.x>=PointList.get(0).x&&point.y>=PointList.get(0).y
                &&point.x<=PointList.get(1).x&&point.y<=PointList.get(1).y)
            return  true;
        return false;
    }
}
