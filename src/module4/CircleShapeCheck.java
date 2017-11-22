package module4;

/**
 * Created by WangGF on 2017/11/20.
 */
public class CircleShapeCheck extends ICheckPoint{
    public CircleShapeCheck(){super();}
    public CircleShapeCheck(CommonMarker marker)
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
        //todo 判断给定两点是否在圆中
        if (PointList.isEmpty())return false;

        float xSquare=(float)Math.pow(point.x-PointList.get(0).x,2) ;
        float ySquare=(float)Math.pow(point.y-PointList.get(0).y,2);
        float rSquare=(float)Math.pow(PointList.get(1).x,2);
        if (xSquare+ySquare<=rSquare) return true;
        return false;
    }
}
