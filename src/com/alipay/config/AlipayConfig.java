package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092000558785";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCLcKUM5GDvmDnLSH+GW/EXC9jjg/MjJc8S6kCGJR7S1eO72xaZRGgPItuQ0QzUd3wY14aDQHDkBxydBihPuVKB4kxJrl8u7NBO6AYCcGxpPLeaktqScmDRMYPaP3pJ2JKFzPjJ2q6mLZ8oJmQn3iiQrv2AOfn1+p/AiXQvR1pkiKLmeUkVbmsnsUFMnpAQmROYuZ3KPklBbrR2/PMichWXOoTIztmy1rY9NV/FB25aAViL2HLv4Q/EXutHicZIX8h0kztgH9jsuQfJL0Gs+NspyWS7CeZTek2A8wfa7292ZGeHpZB219Eq0/27nedVxHIXjBL0sUBuVyUUKArNXZwHAgMBAAECggEADjMwe7meLYghCpSdd/9Q8/ne4nyDfCbTiaeVXpPVKb9ia7UJ/h27Qx9XoM3JMrHgT19TcXZUiMQ4o70GyeejgVqcTjyVsN+o7wAt7H2qbKUkRXeDDrrbJTKXrNgeCfsmIL4Y7+V3N7EZrisKtAypsOJBKpe83tHhBuh4joADso0Yy6YT3dgaYpPoWryLWkvNM/N6P5rrWzcgvbJs07nMy4qc9iFn7BnbfO3xJ8B9Gc3aObiGGhtsooKSN0v5DutZuOD92jXJelyLjYWQSsr74+eMrl79dXvSx0Xi+y79MXvFkh0ygY0SuqReBvtRlwdfUWowUFQe0Rs8n82cc5Q0QQKBgQDXFm685OPgsr142eGVSEQHhkDX9DC1kmmRaMzyVI5DbOcBT31NCG9eBRlWKLzpHa60T0xZd+TszfBhe+iFWWp0e2b2C9tr4f023gRLYKNyaM3lydNAuqtyAA8EC/i8ElLaAPvfm20OoRsZgVcTOy2G6i1ucsBH9Sf2I7XCf54SsQKBgQCl9ph9dpVs+NCwLm1Ex+eEN+IE2tdg+DAtEtKLHeFYmKp9YoUZsBbPGSNmJCsIyquhahZsrlFW0yxOCf4Q4A9PXJGpKrOFqXUWa5+nWBlQjelKs7M9UnzC/TifWL79oivTaxetYE37FptUkHQRndAinMeZmBhvaYhCsSWiPtcYNwKBgQCFLIyQRKCbxc/u/ejgx4fnqMaJb9ag9fCLafpLqPMU6F73vsH0al6aNkoDwOGG7Sv41IiPdN63iKNnmJLVzhFN4gJUIe9QEvL3f+vkyAcrlZy2xIoar/nrcgHaHZd6y1WlSaqqPs/9mN7wodbKP3/m4yQSGNbZNv/xNRcbQG0dYQKBgQCgiAa4VRv0bDhwMng/L54hpmxZhdUPVwJClxJQvnZa3FENN17Hmix15jr3ccSunFunppZKSdMjyN/yHHhEmnY0rbW3jDZZ86/uH+wuUmkqIhqmx2t4xXEoqwc6Gv2jGFqMBerBKYZEeXmGMrQS1jOdR0lKqHP6UHodCHz+kwo7wQKBgDF0PRm1PP7MZ9u4FkZNEP4MudDEQD7H9VrYPvtiVFXLHVw+Vm7ngxF/pDQOgZJN3KQiEqF/anAvzfvF7UC7xzlx6Sbw3oh8gCrZBw9O7BjiBOOXL4qxSAbaBo4UefJaPIPMl9T2HMCwACX3fXhxKNM9We1Ac8o+qzw3jC9Qji7N";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0Mp+DZCcnAMlAx4nF4gg60CurvIdg83R/q9ohACW2Sa2x0WT+NdlWdwaXQ35/2/oviKtU1zdamrfKhVKR67ab8gFpFpuNIJqsrvjQoELogf6WW+JChbIxqv11rBaRNCPwNjoWNWGJlgJAVNhWboNhTKt3YJVH5zi5LsCd9zMgPUfT9LPgR0jQr/u6HGbk9tc1kOswYpqDgnnnXLEWqhXrGX+0KwbkeMfHgXWeXeNiDTBbi4mARZLdoCQGnX5GTSPqgFfDPLTsK1FdBpYdG3eWLi2XHHsgXdHOG/VNA3EMc0248vv7ZVAythrx04Qz2z6j4Fua1oDn29qiyfwY+x6gwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

