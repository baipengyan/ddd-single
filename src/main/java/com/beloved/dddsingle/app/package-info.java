/**
 * 应用层
 * <p>
 * 先按领域分包，再按功能分包
 * <p>
 * 主要负责获取输入，组装上下文，参数校验，调用领域层做业务处理，如果需要的话，发送消息通知等。层次是开放的，应用层也可以绕过领域层，直接访问基础实施层；
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 1.8
 */
package com.beloved.dddsingle.app;