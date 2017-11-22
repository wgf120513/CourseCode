package module4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangGF on 2017/11/20.
 */
public abstract class ICheckPoint
{
    protected ArrayList<Point> PointList;
    public CommonMarker CMarker;
    public ICheckPoint()
    {
        this.PointList=new ArrayList<Point>();
    }
    public ICheckPoint(CommonMarker marker)
    {
        this();
        CMarker=marker;
    }

    public abstract boolean CheckPointIsArea(float point1,float point2);
    public abstract boolean CheckPointIsArea(Point point);


}

