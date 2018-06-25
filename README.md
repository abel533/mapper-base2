# Mybatis 通用 Mapper 基础方法实现 2

该项目直接从 mapper/base 模块复制而来，对接口中的泛型增加了主键和 Example，可以更严格的控制参数。

主要 Mapper 接口为 `tk.mybatis.mapper.common2.Mapper<T, ID, EXAMPLE>`。

> 注意包名中的 **common2**

使用示例如下：

```java
public interface CountryMapper 
    extends Mapper<Country, Integer, Example>, 
            HsqldbMapper<Country>, 
            MySqlMapper<Country>, 
            IdsMapper<Country> {
}
```

和

```java
public interface UserInfoMapper extends Mapper<UserInfo, Integer, Example> {
    
}
```

## 如何引入？

tk.mybatis:mapper 项目默认聚合了 mapper-base 项目，而当前这个是 mapper-base2 项目。

由于包名完全不同，因此可以在原来基础上直接引入 mapper-base2 ：
```xml
<dependency>
    <groupId>tk.mybatis</groupId>
    <artifactId>mapper-base2</artifactId>
    <version>1.0.1</version>
</dependency>
```
