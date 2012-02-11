/*
 * This File is part of the ft.iowarrior project.   
 * Copyright (C) 2012 by Florian Thienel Softwareentwicklung
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package ft.iowarrior;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.wagner_ibw.iow.IowFactory;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(final BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	public void stop(final BundleContext bundleContext) throws Exception {
		Activator.context = null;
		IowFactory.getInstance().closeAllDevices();
	}

}
