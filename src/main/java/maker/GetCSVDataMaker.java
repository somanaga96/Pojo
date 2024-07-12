package maker;

import com.example.generated.user.UserReponse;

public class GetCSVDataMaker {
    private static UserReponse userReponse;

    public static UserReponse getUserReponse() {
        return userReponse;
    }

    public static void setUserReponse(UserReponse userReponse) {
        GetCSVDataMaker.userReponse = userReponse;
    }
}
