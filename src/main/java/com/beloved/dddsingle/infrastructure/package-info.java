/**
 * 基础设施层
 * <p>
 * 主要负责技术细节问题的处理，比如数据库的CRUD、搜索引擎、文件系统、分布式服务的RPC等。此外，领域防腐的重任也落在这里，外部依赖需要通过gateway的转义处理，才能被上面的App层和Domain层使用。
 *
 * @author baipengyan
 * @version 1.0
 * @since JDK 1.8
 */
package com.beloved.dddsingle.infrastructure;