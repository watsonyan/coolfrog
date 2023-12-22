package com.coolfrog.service.impl;

import com.coolfrog.domain.Word;
import com.coolfrog.dao.IWordDao;
import com.coolfrog.service.IWordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课文单词表 服务实现类
 * </p>
 *
 * @author watson
 * @since 2023-12-22
 */
@Service
public class WordServiceImp extends ServiceImpl<IWordDao, Word> implements IWordService {

}
