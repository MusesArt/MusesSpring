package muses.art.service.commodity;

import muses.art.model.commodity.CommodityModel;
import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;

public interface CommodityService {

    StatusModel<PageModel<CommodityModel>> getCommoditiesByPageAndSize();
}
