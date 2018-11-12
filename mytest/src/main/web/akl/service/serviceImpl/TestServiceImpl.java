package akl.service.serviceImpl;

import akl.dao.TestMapper;
import akl.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TestserviceImpl
 * @Author: Guoxy
 * @Date: Created in 13:26 2018/10/29
 * @Version:
 */

@Service("testService")
public class TestServiceImpl implements TestService {


    @Autowired(required = false)
    private TestMapper testMapper;

    @Override
    public int testAction() {

        int i = testMapper.selectCount();

        return i;
    }

}