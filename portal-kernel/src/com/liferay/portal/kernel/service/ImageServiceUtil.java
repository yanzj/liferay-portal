/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for Image. This utility wraps
 * <code>com.liferay.portal.service.impl.ImageServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ImageService
 * @generated
 */
@ProviderType
public class ImageServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.portal.service.impl.ImageServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.Image getImage(long imageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getImage(imageId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ImageService getService() {
		if (_service == null) {
			_service = (ImageService)PortalBeanLocatorUtil.locate(ImageService.class.getName());

			ReferenceRegistry.registerReference(ImageServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static ImageService _service;
}