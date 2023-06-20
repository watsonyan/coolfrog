package com.coolfrog.service.impl;

import com.coolfrog.domain.Sentence;
import com.coolfrog.dao.ISentenceDao;
import com.coolfrog.service.ISentenceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课文单词、句子表 服务实现类
 * </p>
 *
 * @author watson
 * @since 2023-06-20
 */
@Service
public class SentenceServiceImp extends ServiceImpl<ISentenceDao, Sentence> implements ISentenceService {

}
