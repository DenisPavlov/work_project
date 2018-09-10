package tutorials.mkyong.optional;

//public class MobileService {
//
//    public int getMobileScreenWidth(Mobile mobile){
//
//        if(mobile != null){
//            DisplayFeatures dfeatures = mobile.getDisplayFeatures();
//            if(dfeatures != null){
//                ScreenResolution resolution = dfeatures.getResolution();
//                if(resolution != null){
//                    return resolution.getWidth();
//                }
//            }
//        }
//        return 0;
//
//    }
//
//}

import java.util.Optional;

public class MobileService {

    public Integer getMobileScreenWidth(Optional<Mobile> mobile){
        return mobile.flatMap(Mobile::getDisplayFeatures)
                .flatMap(DisplayFeatures::getResolution)
                .map(ScreenResolution::getWidth)
                .orElse(0);

    }

}

