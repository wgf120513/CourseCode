package module4;

/**
 * Created by WangGF on 2017/11/20.
 */
public class TrangleShapeCheck extends ICheckPoint {

    public TrangleShapeCheck(){super();}
    public TrangleShapeCheck(CommonMarker marker)
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
        float a = 0.f, b = 0.f, c = 0.f;
        //todo 判断给定两点是否在三角形中
        Point MA = new Point(point.x - PointList.get(0).x,point.y - PointList.get(0).y);
        Point MB = new Point(point.x - PointList.get(1).x,point.y - PointList.get(1).y);
        Point MC = new Point(point.x - PointList.get(2).x,point.y - PointList.get(2).y);

        a = MA.x * MB.y - MA.y * MB.x;
        b = MB.x * MC.y - MB.y * MC.x;
        c = MC.x * MA.y - MC.y * MA.x;
        if((a <= 0 && b <= 0 && c <= 0)||
                (a > 0 && b > 0 && c > 0))
            return true;

        return false;
    }
}
