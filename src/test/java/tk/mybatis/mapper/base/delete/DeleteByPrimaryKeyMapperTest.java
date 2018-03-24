package tk.mybatis.mapper.base.delete;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.mapper.base.BaseTest;
import tk.mybatis.mapper.base.CountryMapper;

public class DeleteByPrimaryKeyMapperTest extends BaseTest {

    @Test
    public void testDeleteByPrimaryKey(){
        SqlSession sqlSession = getSqlSession();
        try {
            CountryMapper mapper = sqlSession.getMapper(CountryMapper.class);
            Assert.assertEquals(183, mapper.selectAll().size());
            Assert.assertEquals(1, mapper.deleteByPrimaryKey(1L));
            Assert.assertEquals(182, mapper.selectAll().size());

            Assert.assertEquals(1, mapper.deleteByPrimaryKey(2L));
            Assert.assertEquals(181, mapper.selectAll().size());
        } finally {
            sqlSession.close();
        }
    }

}
