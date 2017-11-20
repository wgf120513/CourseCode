package module4;

/**
 * Created by WangGF on 2017/11/20.
 */
public class TrangleShapeCheck extends ICheckPoint {
    @Override
    public boolean CheckPointIsArea(float point1,float point2)
    {
        if (PointList.isEmpty())return false;
        if (PointList.size()!=6)return  false;

        //todo 判断给定两点是否在三角形中

        return false;
    }
}
