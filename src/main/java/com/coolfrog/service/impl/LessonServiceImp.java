package com.coolfrog.service.impl;

import com.coolfrog.domain.Lesson;
import com.coolfrog.dao.ILessonDao;
import com.coolfrog.service.ILessonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课文表 服务实现类
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Service
public class LessonServiceImp extends ServiceImpl<ILessonDao, Lesson> implements ILessonService {

}
