package module4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangGF on 2017/11/20.
 */
public abstract class ICheckPoint
{
    protected ArrayList<Float> PointList;
    public CommonMarker CMarker;
    public ICheckPoint()
    {
        this.PointList=new ArrayList<Float>();
    }
    public ICheckPoint(CommonMarker marker)
    {
        this();
        CMarker=marker;
    }

    public abstract boolean CheckPointIsArea(float point1,float point2);

}
