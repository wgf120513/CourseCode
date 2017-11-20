package module4;

import java.security.Policy;

/**
 * Created by WangGF on 2017/11/20.
 */
public class RectShapeCheck extends ICheckPoint{
    @Override
    public boolean CheckPointIsArea(float point1,float point2) {
        if (PointList.isEmpty())return false;
        if (PointList.size()!=4) return false;
        if (point1>=PointList.get(0).floatValue()&&point1<=PointList.get(1).floatValue()
                &&point2>=PointList.get(2).floatValue()&&point2<=PointList.get(3).floatValue())
            return  true;
        return false;
    }
}
