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

package com.liferay.marketplace.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.marketplace.model.Module;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Module in entity cache.
 *
 * @author Ryan Park
 * @generated
 */
@ProviderType
public class ModuleCacheModel implements CacheModel<Module>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ModuleCacheModel)) {
			return false;
		}

		ModuleCacheModel moduleCacheModel = (ModuleCacheModel)obj;

		if (moduleId == moduleCacheModel.moduleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, moduleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", moduleId=");
		sb.append(moduleId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", appId=");
		sb.append(appId);
		sb.append(", bundleSymbolicName=");
		sb.append(bundleSymbolicName);
		sb.append(", bundleVersion=");
		sb.append(bundleVersion);
		sb.append(", contextName=");
		sb.append(contextName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Module toEntityModel() {
		ModuleImpl moduleImpl = new ModuleImpl();

		if (uuid == null) {
			moduleImpl.setUuid("");
		}
		else {
			moduleImpl.setUuid(uuid);
		}

		moduleImpl.setModuleId(moduleId);
		moduleImpl.setCompanyId(companyId);
		moduleImpl.setAppId(appId);

		if (bundleSymbolicName == null) {
			moduleImpl.setBundleSymbolicName("");
		}
		else {
			moduleImpl.setBundleSymbolicName(bundleSymbolicName);
		}

		if (bundleVersion == null) {
			moduleImpl.setBundleVersion("");
		}
		else {
			moduleImpl.setBundleVersion(bundleVersion);
		}

		if (contextName == null) {
			moduleImpl.setContextName("");
		}
		else {
			moduleImpl.setContextName(contextName);
		}

		moduleImpl.resetOriginalValues();

		return moduleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		moduleId = objectInput.readLong();

		companyId = objectInput.readLong();

		appId = objectInput.readLong();
		bundleSymbolicName = objectInput.readUTF();
		bundleVersion = objectInput.readUTF();
		contextName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(moduleId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(appId);

		if (bundleSymbolicName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bundleSymbolicName);
		}

		if (bundleVersion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bundleVersion);
		}

		if (contextName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contextName);
		}
	}

	public String uuid;
	public long moduleId;
	public long companyId;
	public long appId;
	public String bundleSymbolicName;
	public String bundleVersion;
	public String contextName;
}