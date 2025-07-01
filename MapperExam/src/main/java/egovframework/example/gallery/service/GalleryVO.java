/**
 * 
 */
package egovframework.example.gallery.service;

import org.springframework.web.multipart.MultipartFile;

import egovframework.example.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author user
 * 퀴즈: 필드(MultipartFile image 추가)
 *     생성자 2개 추가
 *      1) String galleryTitle, byte[] galleryData
 *      2) String uuid, String galleryTitle, byte[] galleryData
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GalleryVO extends Criteria {
		private String uuid;
		private String galleryTitle;
		private byte[] galleryData;				// 첨부파일
		private MultipartFile image;			// 내부 목적 사용
		private String galleryFileUrl;
		
		public GalleryVO(String galleryTitle, byte[] galleryData) {
			super();
			this.galleryTitle = galleryTitle;
			this.galleryData = galleryData;
		}

		public GalleryVO(String uuid, String galleryTitle, byte[] galleryData) {
			super();
			this.uuid = uuid;
			this.galleryTitle = galleryTitle;
			this.galleryData = galleryData;
		}
		
		
		
		
}
