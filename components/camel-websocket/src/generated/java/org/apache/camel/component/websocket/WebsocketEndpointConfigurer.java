/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.websocket;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("host", java.lang.String.class);
        map.put("port", java.lang.Integer.class);
        map.put("resourceUri", java.lang.String.class);
        map.put("maxBinaryMessageSize", java.lang.Integer.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("sessionSupport", boolean.class);
        map.put("staticResources", java.lang.String.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("sendTimeout", java.lang.Integer.class);
        map.put("sendToAll", java.lang.Boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("bufferSize", java.lang.Integer.class);
        map.put("maxIdleTime", java.lang.Integer.class);
        map.put("maxTextMessageSize", java.lang.Integer.class);
        map.put("minVersion", java.lang.Integer.class);
        map.put("synchronous", boolean.class);
        map.put("allowedOrigins", java.lang.String.class);
        map.put("crossOriginFilterOn", boolean.class);
        map.put("filterPath", java.lang.String.class);
        map.put("enableJmx", boolean.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedorigins":
        case "allowedOrigins": target.setAllowedOrigins(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "buffersize":
        case "bufferSize": target.setBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "crossoriginfilteron":
        case "crossOriginFilterOn": target.setCrossOriginFilterOn(property(camelContext, boolean.class, value)); return true;
        case "enablejmx":
        case "enableJmx": target.setEnableJmx(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filterpath":
        case "filterPath": target.setFilterPath(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxbinarymessagesize":
        case "maxBinaryMessageSize": target.setMaxBinaryMessageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxidletime":
        case "maxIdleTime": target.setMaxIdleTime(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxtextmessagesize":
        case "maxTextMessageSize": target.setMaxTextMessageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "minversion":
        case "minVersion": target.setMinVersion(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sendtimeout":
        case "sendTimeout": target.setSendTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sendtoall":
        case "sendToAll": target.setSendToAll(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "sessionsupport":
        case "sessionSupport": target.setSessionSupport(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "staticresources":
        case "staticResources": target.setStaticResources(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedorigins":
        case "allowedOrigins": return target.getAllowedOrigins();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "buffersize":
        case "bufferSize": return target.getBufferSize();
        case "crossoriginfilteron":
        case "crossOriginFilterOn": return target.isCrossOriginFilterOn();
        case "enablejmx":
        case "enableJmx": return target.isEnableJmx();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filterpath":
        case "filterPath": return target.getFilterPath();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxbinarymessagesize":
        case "maxBinaryMessageSize": return target.getMaxBinaryMessageSize();
        case "maxidletime":
        case "maxIdleTime": return target.getMaxIdleTime();
        case "maxtextmessagesize":
        case "maxTextMessageSize": return target.getMaxTextMessageSize();
        case "minversion":
        case "minVersion": return target.getMinVersion();
        case "sendtimeout":
        case "sendTimeout": return target.getSendTimeout();
        case "sendtoall":
        case "sendToAll": return target.getSendToAll();
        case "sessionsupport":
        case "sessionSupport": return target.isSessionSupport();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "staticresources":
        case "staticResources": return target.getStaticResources();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

