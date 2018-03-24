package tk.mybatis.mapper.cache;

import org.apache.ibatis.annotations.CacheNamespaceRef;
import tk.mybatis.mapper.base.Country;
import tk.mybatis.mapper.common2.Mapper;
import tk.mybatis.mapper.entity.Example;

/**
 * 这个例子中，在 XML 配置了缓存，这里使用注解引用 XML 中的缓存配置
 *
 * namespace 有两种配置方法，参考下面两行注解
 */
@CacheNamespaceRef(CountryCacheRefMapper.class)
//@CacheNamespaceRef(name = "tk.mybatis.mapper.cache.CountryCacheRefMapper")
public interface CountryCacheRefMapper extends Mapper<Country, Long, Example> {

    /**
     * 定义在 XML 中的方法
     *
     * @param id
     * @return
     */
    Country selectById(Integer id);
}
