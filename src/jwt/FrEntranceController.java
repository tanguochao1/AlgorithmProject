/*
package jwt;

import com.alibaba.druid.util.StringUtils;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

*/
/**
 * 外部接入帆软报表统一入口
 * Created by tanguochao on 2018/11/14.
 *//*

@RequestMapping("/Entrance")
@Controller
public class FrEntranceController {
    */
/**
     * token秘钥，请勿泄露，请勿随便修改 backups:JKKLJOoasdlfj
     *//*

    public static final String SECRET = "JKKLJOoasdlfj";
    */
/**
     * token 过期时间: 10天
     *//*

    public static final int calendarField = Calendar.DATE;
    public static final int calendarInterval = 10;

    @RequestMapping(value = "/index")
    @ResponseBody
    public String entrance() {
        return "123";
    }
    //eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDMxMTE1NjYsImlzcyI6IlNlcnZpY2UiLCJhdWQiOiJBUFAiLCJ1c2VyX2lkIjoiMTIzIiwiaWF0IjoxNTQyMjQ3NTY2fQ.WSCmSBTemLhU3G3aabWxkHW31I7dNPZWj3MSGXCnYj4
    */
/**
     * creat token
     * Created by tanguochao on 2018/11/14.
     *//*

    @ResponseBody
    @RequestMapping(value = "/createToken")
    public static String createToken(Long user_id) throws Exception {
        Date iatDate = new Date(); // expire time
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(calendarField, calendarInterval);
        Date expiresDate = nowTime.getTime(); // header Map
        Map<String, Object> map = new HashMap<>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");
        // build token
        // param backups {iss:Service, aud:APP}
        String token = JWT.create().withHeader(map) // header
                .withClaim("iss", "Service") // payload
                .withClaim("aud", "APP")
                .withClaim("user_id", null == user_id ? null : user_id.toString())
                .withIssuedAt(iatDate) // sign time
                .withExpiresAt(expiresDate) // expire time
                .sign(Algorithm.HMAC256(SECRET)); // signature
        return token;
    }

    */
/**
     * 解密Token
     * Created by tanguochao on 2018/11/14.
     *
     * @param token
     * @return Map
     * @throws Exception
     *//*

    @ResponseBody
    @RequestMapping(value = "/verifyToken")
    public static Map<String, Claim> verifyToken(String token) {
        DecodedJWT jwt = null;
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            jwt = verifier.verify(token);
        } catch (Exception e) {
            // e.printStackTrace();
            // token 校验失败, 抛出Token验证非法异常
        }
        return jwt.getClaims();
    }

    */
/**
     * 根据Token获取user_id
     *
     * @param token
     * @return user_id
     *//*

    @ResponseBody
    @RequestMapping(value = "/getAppUID")
    public static Long getAppUID(String token) {
        Map<String, Claim> claims = verifyToken(token);
        Claim user_id_claim = claims.get("user_id");
        if (null == user_id_claim || StringUtils.isEmpty(user_id_claim.asString())) {
            // token 校验失败, 抛出Token验证非法异常
            return Long.parseLong("0");
        }
        return Long.valueOf(user_id_claim.asString());
    }
}
*/
