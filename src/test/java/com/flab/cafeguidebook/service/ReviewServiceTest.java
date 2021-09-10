package com.flab.cafeguidebook.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.flab.cafeguidebook.dto.ReviewDTO;
import com.flab.cafeguidebook.fixture.CafeDTOFixtureProvider;
import com.flab.cafeguidebook.fixture.ReviewDTOFixtureProvider;
import com.flab.cafeguidebook.fixture.ReviewFixtureProvider;
import com.flab.cafeguidebook.mapper.ReviewMapper;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({SpringExtension.class, CafeDTOFixtureProvider.class, ReviewDTOFixtureProvider.class,
    ReviewFixtureProvider.class})
@SpringBootTest
public class ReviewServiceTest {

  @Mock
  private ReviewMapper reviewMapper;

  @InjectMocks
  private ReviewService reviewService;

  @Test
  public void getUsersReviewSuccess(ReviewDTO review) {
    final List<ReviewDTO> reviewList = new ArrayList<>();
    reviewList.add(review);
    reviewList.add(review);
    reviewList.add(review);
    when(reviewMapper.selectReviews(review.getUserId())).thenReturn(reviewList);

    assertEquals(reviewService.getUsersReviews(review.getUserId()).size(), 3);

    verify(reviewMapper).selectReviews(review.getUserId());
  }

  @Test
  public void getCafesReviewSuccess(ReviewDTO review) {
    final List<ReviewDTO> reviewList = new ArrayList<>();
    reviewList.add(review);
    reviewList.add(review);
    reviewList.add(review);
    when(reviewMapper.selectCafesReviews(review.getCafeId())).thenReturn(reviewList);

    assertEquals(reviewService.getCafesReviews(review.getCafeId()).size(), 3);

    verify(reviewMapper).selectCafesReviews(review.getCafeId());
  }

  @Test
  public void getUsersReviewSuccess(ReviewDTO review) {
    final List<ReviewDTO> reviewList = new ArrayList<>();
    reviewList.add(review);
    reviewList.add(review);
    reviewList.add(review);
    when(reviewMapper.selectReviews(review.getUserId())).thenReturn(reviewList);

    assertEquals(reviewService.getUsersReviews(review.getUserId()).size(), 3);

    verify(reviewMapper).selectReviews(review.getUserId());
  }

  @Test
  public void getCafesReviewSuccess(ReviewDTO review) {
    final List<ReviewDTO> reviewList = new ArrayList<>();
    reviewList.add(review);
    reviewList.add(review);
    reviewList.add(review);
    when(reviewMapper.selectCafesReviews(review.getCafeId())).thenReturn(reviewList);

    assertEquals(reviewService.getCafesReviews(review.getCafeId()).size(), 3);

    verify(reviewMapper).selectCafesReviews(review.getCafeId());
  }
}
