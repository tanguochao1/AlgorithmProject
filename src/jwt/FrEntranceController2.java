/*
package jwt;

import com.alibaba.druid.util.StringUtils;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fr.third.guava.base.Optional;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RequestMapping("/Entrance2")
@Controller
public class FrEntranceController2 {
    */
/**
     * token秘钥，请勿泄露，请勿随便修改
     *//*

    public static final String SECRET = "auditreportsecret";

    */
/**
     * 利用jwt解析token信息.
     *
     * @param token  要解析的token信息
     * @param secret 用于进行签名的秘钥
     * @return
     * @throws Exception
     *//*

    @ResponseBody
    @RequestMapping(value = "/getClaimsFromToken")
    public Optional<Claims> getClaimsFromToken(String token, String secret) throws Exception {
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
        JwsHeader header = claimsJws.getHeader();
        Claims body = claimsJws.getBody();
        System.out.println("jwt header:" + header);
        System.out.println("jwt body:" + body);
        System.out.println("jwt body user-id:" + body.get("user_id", String.class));
        return null;
    }

    */
/**
     * 验证token是否过期
     *
     * @param tooken 要解析的token信息
     * @param secret 用于进行签名的秘钥
     * @return
     * @throws Exception
     *//*

    @ResponseBody
    @RequestMapping(value = "/isExpired")
    public boolean isExpired(String tooken, String secret) throws Exception {
        Optional<Claims> claims = getClaimsFromToken(tooken, secret);
        if (claims != null) {
            Date expiration = claims.get().getExpiration();
            return expiration.before(expiration);
        }
        return false;
    }

    */
/**
     * 获取tooken中的参数值
     *
     * @param token 要解析的token信息
     *              //     * @param SCRECT 用于进行签名的秘钥
     * @return Map
     * @throws Exception
     *//*

    @RequestMapping(value = "/extractInfo")
    @ResponseBody
    public Map<String, Object> extractInfo(String token) throws Exception {
        String secret = SECRET;
        Optional<Claims> claims = getClaimsFromToken(token, secret);
        if (claims != null) {
            Map<String, Object> info = new HashMap<String, Object>();
            Set<String> keySet = claims.get().keySet();
            //通过迭代，提取token中的参数信息
            Iterator<String> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                Object value = claims.get().get(key);
                info.put(key, value);
            }
            return info;
        }
        return null;
    }

    */
/**
     * 验证tooken
     *
     * @param token 要解析的token信息
     *              //     * @param SCRECT 用于进行签名的秘钥
     * @return Map
     * @throws Exception
     *//*

    @RequestMapping(value = "/validateToken")
    public String validateToken(String token, HttpServletRequest request) {
        Map<String, Object> resp = new HashMap<String, Object>();
        if (token != null) {
            // 解析token
            try {
                Map<String, Object> body = Jwts.parser()
                        .setSigningKey(SECRET)
                        .parseClaimsJws(token)
                        .getBody();
                String userIp = (String) (body.get("userIp"));
                //获取请求的地址ip
                String s = FrEntranceController2.getRemoteIp(request);
                if (userIp.equals(s)) {
                    //获取根路径
                    int endIndex = request.getRequestURL().length() - request.getServletPath().length() + 1;
                    String rootUrl = request.getRequestURL().substring(0, endIndex);
                    //获取请求参数
                    String queryurl = request.getQueryString();
                    //截取第一个&后面所有的字符
                    String charurl = queryurl.substring(queryurl.indexOf("&") + 1);
                    String cpturl = "ReportServer?";
                    //直接返回帆软页面
                    return "redirect:" + rootUrl + cpturl + charurl;
                } else {
                    return "";
                }
            } catch (SignatureException | MalformedJwtException e) {
                // jwt 解析错误
                return "";
            } catch (ExpiredJwtException e) {
                // jwt 已经过期，在设置jwt的时候如果设置了过期时间，这里会自动判断jwt是否已经过期，如果过期则会抛出这个异常，我们可以抓住这个异常并作相关处理。
                return "";
            }
        } else {
//            resp.put("ERR_MSG", Constants.ERR_MSG_TOKEN_EMPTY);
//            resp.put("ERR_MSG", "token为空!");
            return "";
        }
    }

    //获取ip
    public static String getRemoteIp(HttpServletRequest request) {
        String ip = null;
        if (request.getHeader("ORIG_CLIENT_IP") != null) {
            ip = request.getHeader("ORIG_CLIENT_IP");
        }

        if (ip == null && request.getHeader("x-forwarded-for") != null) {
            ip = request.getHeader("x-forwarded-for");

            if (ip != null) {
                ip = ip.split("\\s*,\\s*")[0];
            }
        }
        if (ip == null) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
*/
